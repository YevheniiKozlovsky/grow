CONNECT 'jdbc:derby://localhost:1527/motor_depot;user=admin;password=admin';

--filling table Role
insert into admin.Role (name) values('driver');
insert into admin.Role (name) values('dispatcher');
insert into admin.Role (name) values('admin');

--filling table Account_person
insert into admin.User_ (name, password, email, activate, telephone, date_registration, time_registration, id_role, photo, activate_superuser)
	values('driver', 'tN74IXytribU2mM/0qTljjJsu11XCv3DmJSE2gevNXk=', 'driver@gmail.com', true, '0663156434', '2015-01-23', '12:20:00', 1, 'default\user_img.png', true);
insert into admin.User_ (name, password, email, activate, telephone, date_registration, time_registration, id_role, photo, activate_superuser)
	values('dispatcher', '/3/OZz0vUrBxEp40/46lcLcVlSfQGcgex3VvT4yCFTU=', 'dispatcher@gmail.com', true,  '0663156576', '2015-01-23', '12:20:00', 2, 'default\user_img.png', true);
insert into admin.User_ (name, password, email, activate, telephone, date_registration, time_registration, id_role, photo, activate_superuser)
	values('admin', 'jGl25bVBBBW96Qi9Te4V37Fnqchz/Eu4qB9vKrRIqRg=', 'admin@gmail.com', true, '0663156506', '2015-01-23', '12:20:00', 3, 'default\user_img.png', true);
insert into admin.User_ (name, password, email, activate, telephone, date_registration, time_registration, id_role, photo, activate_superuser)
	values('������ ����', 'tN74IXytribU2mM/0qTljjJsu11XCv3DmJSE2gevNXk=', 'ivanov@gmail.com', true, '0663120967', '2015-01-23', '12:20:00', 3, 'default\user_img.png', true);

--filling table trip_status
insert into admin.Trip_status (name) values('open');
insert into admin.Trip_status (name) values('progress');
insert into admin.Trip_status (name) values('closed');
insert into admin.Trip_status (name) values('canceled');

--filling table car_status
insert into admin.Car_status (name) values('good');
insert into admin.Car_status (name) values('bed');
insert into admin.Car_status (name) values('busy');

--filling table car
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Mercedes 204', 'BI 4390 AM', 430, 22, 'white', 1, 'default\car_img.png');
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Fiat express', 'BI 5629 AM', 368, 15, 'Yellow', 1, 'default\car_img.png');
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Volkswagen jetta 20', 'BI 1237 AM', 560, 34, 'red', 1, 'default\car_img.png');
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Volkswagen jetta 20', 'BI 3059 AM', 430, 34, 'red', 1, 'default\car_img.png');
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Volkswagen passat 70', 'BI 9011 AM', 620, 45, 'red', 1, 'default\car_img.png');
insert into admin.Car (name, car_number, power, number_place, color, id_car_status, photo)
	values('Volkswagen passat 70', 'BI 1117 AM', 620, 45, 'red', 1, 'default\car_img.png');

--filling table trip
insert into admin.Trip (number, trip_from, trip_where, date, time, date_from, time_from, id_trip_status, id_creater, id_car, id_driver)
	values(145, '����', '�������', '2015-01-23', '12:20:00', '2015-11-04', '11:20:00', 1, 2, NULL, NULL);
insert into admin.Trip (number, trip_from, trip_where, date, time, date_from, time_from, id_trip_status, id_creater, id_car, id_driver)
	values(148, '����', '������', '2015-01-23', '12:20:00', '2015-11-05', '09:00:00', 1, 2, NULL, NULL);
insert into admin.Trip (number, trip_from, trip_where, date, time, date_from, time_from, id_trip_status, id_creater, id_car, id_driver)
	values(138, '�������', '�������', '2015-01-23', '12:20:00', '2015-11-10', '13:45:00', 1, 2, NULL, NULL);
insert into admin.Trip (number, trip_from, trip_where, date, time, date_from, time_from, id_trip_status, id_creater, id_car, id_driver)
	values(243, '����', '������', '2015-01-23', '12:20:00', '2015-11-15', '09:50:00', 1, 2, NULL, NULL);

DISCONNECT;
