#📝 Ejercicio: Filtrar líneas de un archivo
🎯 Objetivo
Leer un archivo de texto llamado entrada.txt que contiene varias líneas. Filtrar solo aquellas líneas que contienen una palabra clave específica (por ejemplo, "ERROR") y escribirlas en un nuevo archivo llamado errores.txt.

📂 Estructura del archivo entrada.txt (ejemplo)
Código
INFO: El sistema inició correctamente
ERROR: No se pudo conectar a la base de datos
DEBUG: Variable x = 42
ERROR: Fallo en la autenticación
INFO: Proceso completado
💡 Requisitos
Leer línea por línea (IO) o por bloques (NIO).

Filtrar solo las líneas que contienen "ERROR".

Escribir esas líneas en errores.txt.

🧪 ¿Qué aprenderás?
Cómo manejar archivos con BufferedReader y BufferedWriter (IO).

Cómo usar FileChannel, ByteBuffer y CharsetDecoder (NIO).

Comparar rendimiento, legibilidad y complejidad entre ambos enfoques.
