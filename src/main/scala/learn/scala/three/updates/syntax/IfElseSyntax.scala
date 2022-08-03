package learn.scala.three.updates.syntax

class IfElseSyntax {

  val oldConditionalStatement1 = if( 1 > 2 ) {
    "Math doesn't seem right"
  } else {
    "thing feel okay"
  }

  val oldConditionalStatement2 = if (1 > 2)
    "Math doesn't seem right"
  else
    "thing feel okay"

  val oldConditionalStatementInline = if (1 > 2) "Math doesn't seem right" else "thing feel okay"

  val newConditionalStatement =
    if 1 > 2 then
      "Math doesn't seem right"
    else
      "thing feel okay"
    end if

}
