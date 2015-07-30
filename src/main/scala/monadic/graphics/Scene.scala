package monadic.graphics

case class GLContext[A]()

case class Scene[S, A](f: GLContext[S] => (GLContext[S], A)){
  def apply(s: GLContext[S]) = f(s)
}