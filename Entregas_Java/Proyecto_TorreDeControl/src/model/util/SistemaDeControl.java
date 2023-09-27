package model.util;

import java.util.List;

import model.domain.Volador;

public interface SistemaDeControl {

	public boolean verificarVolador(Volador volador);
	public void autorizarAterrizaje(Volador volador);
	public void asignarPista(Volador volador, boolean estadoAutorizacion);
}
