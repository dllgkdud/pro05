use shop;
commit;

create table sample(
	id varchar(20), 
    pw varchar(20)
);

insert into sample values ('admin', '1234');
insert into sample values ('lhy', '1111');

select * from sample;