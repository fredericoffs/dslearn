INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Yellow', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Sandubas Java café','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1iHNZ4e-FSOhuYr9Fqsjvl2ETPE7VrM-Img&usqp=CAU','https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-01-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-01-13T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2023-02-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2024-02-13T03:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Trilha HTML','Trilha principal do curso', 1, 'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Forum','Tire suas dúvidas', 2, 'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES ('Lives','Lives exclusivas', 3, 'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 1', 'Neste cap vamos começar', 1,'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 2', 'Neste cap vamos continuar', 2,'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capítulo 3', 'Neste cap vamos finalizar', 3,'https://live.staticflickr.com/5647/21807303085_34c998a42a_z.jpg', 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2023-01-13T13:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2023-01-13T13:00:00Z', null, true, false);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 1 - cap 1', 1, 1);
INSERT INTO tb_content (id, text_Content, video_uri) VALUES (1, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=zE-a5eqvlv8');
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 2 - cap 1', 2, 1);
INSERT INTO tb_content (id, text_Content, video_uri) VALUES (2, '', 'https://www.youtube.com/watch?v=zE-a5eqvlv8');
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 3 - cap 1', 3, 1);
INSERT INTO tb_content (id, text_Content, video_uri) VALUES (3, '', 'https://www.youtube.com/watch?v=zE-a5eqvlv8');
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Tarefa - cap 1', 4, 1);
INSERT INTO tb_task (id, description, question_count, approval_count, weight, due_date) VALUES (4, 'Fazer um trabalho', 5, 4, 1.0, TIMESTAMP WITH TIME ZONE '2023-01-13T13:00:00Z');
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);