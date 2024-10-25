create table if not exists jasypt_encyptor(
encryption_method varchar(255) not null,
jasypt_modes varchar(255) null,
app_config_for_started varchar(255) null,
algorithm varchar(255) null,
key_obtention_iterations varchar(255) null,
provider_name varchar(255) null,
salt_generator_class_name varchar(255) null,
config_code Integer null,
output_type varchar(255) null,
simple_string_mode varchar(255) null,
normal_assertions varchar(255) null,
constraint jasypt_encyptor_pk primary key(encryption_method));