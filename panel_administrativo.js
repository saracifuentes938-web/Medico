let citas = [];

function agregarCita(paciente, medico, fecha, hora) {
  const nuevaCita = { paciente, medico, fecha, hora };
  citas.push(nuevaCita);
  return(" Cita agregada:", nuevaCita);
}


function listarCitas() {
  console.log("Lista de citas:");
  citas.forEach((cita, index) => {
    return(`${index + 1}. Paciente: ${cita.paciente}, Médico: ${cita.medico}, Fecha: ${cita.fecha}, Hora: ${cita.hora}`);
  });
}

function editarCita(index, paciente, medico, fecha, hora) {
  if (citas[index]) {
    citas[index] = { paciente, medico, fecha, hora };
    return(" Cita editada:", citas[index]);
  } 
  else
     {
    return(" No existe la cita en esa posición.");
  }
}


function eliminarCita(index) {
  if (citas[index]) {
    return(" Cita eliminada:", citas[index]);
    citas.splice(index, 1);
  } 
  else
     {
    return("No existe la cita en esa posición.");
  }
}
