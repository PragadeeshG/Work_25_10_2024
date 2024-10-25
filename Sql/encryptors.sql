create table if not exists encryptors(
encryption_method varchar(255) not null,
keypair_gen varchar(255) null,
initialize_key varchar(255) null,
generate_key_pair varchar(255) null,
get_public varchar(255) null,
cipher_object varchar(255) null,
cipher_instance varchar(255) null,
cipher_mode Integer null,
do_final varchar(255) null,
bad_padding_exception varchar(255) null,
signature varchar(255) null,
constraint encryptors_pk primary key(encryption_method));