INSERT INTO `sistemaactivos`.`dependencia` (`codigo`, `nombre`) VALUES ('001', 'Esc.Informatica');
INSERT INTO `sistemaactivos`.`dependencia` (`codigo`, `nombre`) VALUES ('002', 'Esc.Administracion');

INSERT INTO `sistemaactivos`.`funcionario` (`id`, `nombre`) VALUES ('001', 'Juan Bogantes');
INSERT INTO `sistemaactivos`.`funcionario` (`id`, `nombre`) VALUES ('002', 'Benito Ramirez');
INSERT INTO `sistemaactivos`.`funcionario` (`id`, `nombre`) VALUES ('003', 'Lucrecia Arrieta');
INSERT INTO `sistemaactivos`.`funcionario` (`id`, `nombre`) VALUES ('004', 'Paolo Carballo');

INSERT INTO `sistemaactivos`.`usuario` (`id`, `pass`, `funcionarioUsuario`) VALUES ('001', '001', '001');
INSERT INTO `sistemaactivos`.`usuario` (`id`, `pass`, `funcionarioUsuario`) VALUES ('002', '002', '002');
INSERT INTO `sistemaactivos`.`usuario` (`id`, `pass`, `funcionarioUsuario`) VALUES ('003', '003', '003');
INSERT INTO `sistemaactivos`.`usuario` (`id`, `pass`, `funcionarioUsuario`) VALUES ('004', '004', '004');

INSERT INTO `sistemaactivos`.`puesto` (`codigo`, `puesto`) VALUES ('001', 'Administrador de');
INSERT INTO `sistemaactivos`.`puesto` (`codigo`, `puesto`) VALUES ('002', 'Secretariado');
INSERT INTO `sistemaactivos`.`puesto` (`codigo`, `puesto`) VALUES ('003', 'Registrador');
INSERT INTO `sistemaactivos`.`puesto` (`codigo`, `puesto`) VALUES ('004', 'Jefe OCCB');

-- SELECT * FROM solicitud INNER JOIN bien ON solicitud.numSolicitud = bien.solicitudBien;

-- SELECT * FROM usuario INNER JOIN funcionario ON usuario.funcionarioUsuario = funcionario.id; 