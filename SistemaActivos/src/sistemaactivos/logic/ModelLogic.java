/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.logic;

import java.util.List;
import sistemaactivos.data.DaoActivos;
import sistemaactivos.data.DaoAdministracion;
import sistemaactivos.data.DaoSolicitudes;

/**
 *
 * @author ExtremeTech
 */
public class ModelLogic {

    private final DaoSolicitudes daoSolicitud;
    private final DaoActivos daoActivos;
    private final DaoAdministracion daoAdministracion;

    private static ModelLogic uniqueInstance;

    public static ModelLogic instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ModelLogic();
        }
        return uniqueInstance;
    }

    private ModelLogic() {
        daoSolicitud = new DaoSolicitudes();
        daoActivos = new DaoActivos();
        daoAdministracion = new DaoAdministracion();
    }

    public Usuario getUsuario(String id, String clave) throws Exception {
        Usuario u = daoAdministracion.usuarioGet(id);
        if (u.getPass().equals(clave)) {
            return u;
        } else {
            throw new Exception("Clave incorrecta");
        }
    }

    //<editor-fold desc="Bien" defaultstate="collapsed">
    public List<Bien> getBienes() {
        return daoSolicitud.BienGetAll();
    }

    public Bien getBien(String serial) throws Exception {
        return daoSolicitud.BienGet(serial);
    }

    public List<Bien> searchBien(Bien filtro) {
        return daoSolicitud.BienSearch(filtro);
    }

    public void deleteBien(Bien p) throws Exception {
        daoSolicitud.BienDelete(p);
    }

    public void addBien(Bien bien) throws Exception {
        daoSolicitud.BienAdd(bien);
    }

    public void updateBien(Bien bien) throws Exception {
        daoSolicitud.BienUpdate(bien);
    }
    //</editor-fold>

    //  <editor-fold desc="Solicitudes" defaultstate="collapsed">
    public List<Solicitud> getSolicitud() {
        return daoSolicitud.SolicitudGetAll();
    }

    public Solicitud getSolicitud(String serial) throws Exception {
        return daoSolicitud.SolicitudGet(Integer.parseInt(serial));
    }

    public void deleteSolicitud(Solicitud p) throws Exception {
        daoSolicitud.SolicitudDelete(p);
    }

    public void addSolicitud(Solicitud solicitud) throws Exception {
        daoSolicitud.SolicitudAdd(solicitud);
    }

    public void updateSolicitud(Solicitud solicitud) throws Exception {
        daoSolicitud.SolicitudUpdate(solicitud);
    }

    public List<Solicitud> searchSolicitud(Solicitud filtro) {
        return daoSolicitud.SolicitudSearch(filtro);
    }
    
    public List<Solicitud> searchSolicitudbyFuncionario(Funcionario filtro) {
        return daoSolicitud.searchSolicitudbyFuncionario(filtro);
    }

    //</editor-fold>
    
    //  <editor-fold desc="Funcionario" defaultstate="collapsed">
    public List<Funcionario> getFuncionarios() {
        return daoAdministracion.FuncionarioGetAll();
    }

    public Funcionario getFuncionario(Integer codigo) throws Exception {
        return daoAdministracion.FuncionarioGet(codigo.toString());
    }

    public List<Funcionario> searchFuncionario(Funcionario filtro) {
        if (filtro.getId().length() == 0 && filtro.getNombre().length() != 0) {
            return daoAdministracion.FuncionaroSearchNombre(filtro);
        } else if (filtro.getId().length() != 0 && filtro.getNombre().length() == 0) {
            return daoAdministracion.FuncionarioSearchCodigo(filtro);
        } else if (filtro.getId().length() != 0 && filtro.getNombre().length() != 0) {
            return daoAdministracion.FuncionarioSearch(filtro);
        } else {
            return daoAdministracion.FuncionarioGetAll();
        }
    }

    public void deleteFuncionario(Funcionario p) throws Exception {
        daoAdministracion.FuncionarioDelete(p);
    }

    public void addFuncionario(Funcionario funcionario) throws Exception {
        daoAdministracion.FuncionarioAdd(funcionario);
    }

    public void updateFuncionario(Funcionario funcionario) throws Exception {
        daoAdministracion.FuncionarioUpdate(funcionario);
    }

    //</editor-fold>
    
    //  <editor-fold desc="Dependencia" defaultstate="collapsed">
    public List<Dependencia> getDependencias() {
        return daoAdministracion.DependenciaGetAll();
    }

    public Dependencia getDependencia(Dependencia filter) throws Exception {
        return daoAdministracion.dependenciaGet(filter.getCodigo());
    }

    public List<Dependencia> searchDependenciaCodigo(Dependencia filtro) {

        return daoAdministracion.DependenciaSearchCodigo(filtro);
    }

    public List<Dependencia> searchDependencia(Dependencia filtro) {
        if (filtro.getCodigo().length() == 0 && filtro.getNombre().length() != 0) {
            return daoAdministracion.DependenciaSearchNombre(filtro);
        } else if (filtro.getCodigo().length() != 0 && filtro.getNombre().length() == 0) {
            return daoAdministracion.DependenciaSearchCodigo(filtro);
        } else if (filtro.getCodigo().length() != 0 && filtro.getNombre().length() != 0) {
            return daoAdministracion.DependenciaSearch(filtro);
        } else {
            return daoAdministracion.DependenciaGetAll();
        }

    }

    public void deleteDependencia(Dependencia p) throws Exception {
        daoAdministracion.DependenciaDelete(p);
    }

    public void addDependencia(Dependencia dependencia) throws Exception {
        daoAdministracion.DependenciaAdd(dependencia);
    }

    public void updateDependencia(Dependencia dependencia) throws Exception {
        daoAdministracion.DependenciaUpdate(dependencia);
    }
    //</editor-fold>

    //  <editor-fold desc="Activos" defaultstate="collapsed">
    public List<Activo> getActivos() {
        return daoActivos.ActivosGetAll();
    }

    public Activo getActivo(String codigoId) throws Exception {
        return daoActivos.ActivoGet(codigoId);
    }

    public void deleteActivo(Activo a) throws Exception {
        daoActivos.ActivoDelete(a);
    }

    public void addActivo(Activo activo) throws Exception {
        daoActivos.ActivoAdd(activo);
    }

    public void updateActivo(Activo activo) throws Exception {
        daoActivos.ActivoUpdate(activo);
    }

    public List<Activo> searchActivo(Activo filtro) {
        return daoActivos.ActivoSearch(filtro);
    }

    //</editor-fold>
    
    public void close() {
        daoSolicitud.close();
        daoActivos.close();
        daoAdministracion.close();
    }
    
    public List<Puesto> getPuestos() {
        return daoAdministracion.puestoGetAll();
    }
    
    public List<Labor> getLaboresbyFuncionario(String FunId)throws Exception{
        return daoAdministracion.laborGetbyFuncionario(FunId);
    }
}
