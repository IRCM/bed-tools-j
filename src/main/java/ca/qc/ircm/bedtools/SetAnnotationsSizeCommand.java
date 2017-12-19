package ca.qc.ircm.bedtools;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.validators.PositiveInteger;

/**
 * Set annotations' size parameters.
 */
@Parameters(
    separators = " =",
    commandNames = SetAnnotationsSizeCommand.SET_ANNOTATIONS_SIZE_COMMAND,
    commandDescription = "Set annotations' size")
public class SetAnnotationsSizeCommand {
  public static final String SET_ANNOTATIONS_SIZE_COMMAND = "setannotationssize";

  @Parameter(names = { "-h", "-help", "--h", "--help" }, description = "Show help", help = true)
  public boolean help = false;
  @Parameter(
      names = { "-s", "-size" },
      description = "Annotations size",
      required = true,
      validateWith = PositiveInteger.class)
  public Integer size;
}