**Trabajo de formulario**

Este formulario trae tres campos:
. nombre
. apellido
. profesion

No use JS pero en su lugar use Thymeleaf.Ademas use una nueva notacion @Autowired que me permitio traer desde el UserRestController la lista que ya tenia de usuarios como un tipo de inyeccion automatica de UserRestController
sin necesidad de volver a instanciar la clase, porque sin hacer uso de esta notacion se reiniciaba la lista y lo que hacia era que se mostraba vacia.
