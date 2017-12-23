package io.github.pauljamescleary.petstore.validation

import io.github.pauljamescleary.petstore.model.Pet

sealed trait ValidationError extends Product with Serializable
final case class PetAlreadyExistsError(pet: Pet) extends ValidationError
final case class PetNotFoundError() extends ValidationError
final case class OrderNotFoundError() extends ValidationError