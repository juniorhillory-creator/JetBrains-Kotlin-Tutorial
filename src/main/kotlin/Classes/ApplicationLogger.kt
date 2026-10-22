//ApplicationLogger
package Classes

import Interfaces.Logger
import java.beans.DefaultPersistenceDelegate

class ApplicationLogger(
    private val delegate: Logger
): Logger by delegate
