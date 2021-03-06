# GraphHopper Directions API
# 
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
# 
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MatrixRequest Class
#'
#' @field points 
#' @field from_points 
#' @field to_points 
#' @field point_hints 
#' @field from_point_hints 
#' @field to_point_hints 
#' @field out_arrays 
#' @field vehicle 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MatrixRequest <- R6::R6Class(
  'MatrixRequest',
  public = list(
    `points` = NULL,
    `from_points` = NULL,
    `to_points` = NULL,
    `point_hints` = NULL,
    `from_point_hints` = NULL,
    `to_point_hints` = NULL,
    `out_arrays` = NULL,
    `vehicle` = NULL,
    initialize = function(`points`, `from_points`, `to_points`, `point_hints`, `from_point_hints`, `to_point_hints`, `out_arrays`, `vehicle`){
      if (!missing(`points`)) {
        stopifnot(is.list(`points`), length(`points`) != 0)
        lapply(`points`, function(x) stopifnot(R6::is.R6(x)))
        self$`points` <- `points`
      }
      if (!missing(`from_points`)) {
        stopifnot(is.list(`from_points`), length(`from_points`) != 0)
        lapply(`from_points`, function(x) stopifnot(R6::is.R6(x)))
        self$`from_points` <- `from_points`
      }
      if (!missing(`to_points`)) {
        stopifnot(is.list(`to_points`), length(`to_points`) != 0)
        lapply(`to_points`, function(x) stopifnot(R6::is.R6(x)))
        self$`to_points` <- `to_points`
      }
      if (!missing(`point_hints`)) {
        stopifnot(is.list(`point_hints`), length(`point_hints`) != 0)
        lapply(`point_hints`, function(x) stopifnot(is.character(x)))
        self$`point_hints` <- `point_hints`
      }
      if (!missing(`from_point_hints`)) {
        stopifnot(is.list(`from_point_hints`), length(`from_point_hints`) != 0)
        lapply(`from_point_hints`, function(x) stopifnot(is.character(x)))
        self$`from_point_hints` <- `from_point_hints`
      }
      if (!missing(`to_point_hints`)) {
        stopifnot(is.list(`to_point_hints`), length(`to_point_hints`) != 0)
        lapply(`to_point_hints`, function(x) stopifnot(is.character(x)))
        self$`to_point_hints` <- `to_point_hints`
      }
      if (!missing(`out_arrays`)) {
        stopifnot(is.list(`out_arrays`), length(`out_arrays`) != 0)
        lapply(`out_arrays`, function(x) stopifnot(is.character(x)))
        self$`out_arrays` <- `out_arrays`
      }
      if (!missing(`vehicle`)) {
        stopifnot(is.character(`vehicle`), length(`vehicle`) == 1)
        self$`vehicle` <- `vehicle`
      }
    },
    toJSON = function() {
      MatrixRequestObject <- list()
      if (!is.null(self$`points`)) {
        MatrixRequestObject[['points']] <- lapply(self$`points`, function(x) x$toJSON())
      }
      if (!is.null(self$`from_points`)) {
        MatrixRequestObject[['from_points']] <- lapply(self$`from_points`, function(x) x$toJSON())
      }
      if (!is.null(self$`to_points`)) {
        MatrixRequestObject[['to_points']] <- lapply(self$`to_points`, function(x) x$toJSON())
      }
      if (!is.null(self$`point_hints`)) {
        MatrixRequestObject[['point_hints']] <- self$`point_hints`
      }
      if (!is.null(self$`from_point_hints`)) {
        MatrixRequestObject[['from_point_hints']] <- self$`from_point_hints`
      }
      if (!is.null(self$`to_point_hints`)) {
        MatrixRequestObject[['to_point_hints']] <- self$`to_point_hints`
      }
      if (!is.null(self$`out_arrays`)) {
        MatrixRequestObject[['out_arrays']] <- self$`out_arrays`
      }
      if (!is.null(self$`vehicle`)) {
        MatrixRequestObject[['vehicle']] <- self$`vehicle`
      }

      MatrixRequestObject
    },
    fromJSON = function(MatrixRequestJson) {
      MatrixRequestObject <- jsonlite::fromJSON(MatrixRequestJson)
      if (!is.null(MatrixRequestObject$`points`)) {
        self$`points` <- lapply(MatrixRequestObject$`points`, function(x) {
          pointsObject <- Numeric$new()
          pointsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          pointsObject
        })
      }
      if (!is.null(MatrixRequestObject$`from_points`)) {
        self$`from_points` <- lapply(MatrixRequestObject$`from_points`, function(x) {
          from_pointsObject <- Numeric$new()
          from_pointsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          from_pointsObject
        })
      }
      if (!is.null(MatrixRequestObject$`to_points`)) {
        self$`to_points` <- lapply(MatrixRequestObject$`to_points`, function(x) {
          to_pointsObject <- Numeric$new()
          to_pointsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          to_pointsObject
        })
      }
      if (!is.null(MatrixRequestObject$`point_hints`)) {
        self$`point_hints` <- MatrixRequestObject$`point_hints`
      }
      if (!is.null(MatrixRequestObject$`from_point_hints`)) {
        self$`from_point_hints` <- MatrixRequestObject$`from_point_hints`
      }
      if (!is.null(MatrixRequestObject$`to_point_hints`)) {
        self$`to_point_hints` <- MatrixRequestObject$`to_point_hints`
      }
      if (!is.null(MatrixRequestObject$`out_arrays`)) {
        self$`out_arrays` <- MatrixRequestObject$`out_arrays`
      }
      if (!is.null(MatrixRequestObject$`vehicle`)) {
        self$`vehicle` <- MatrixRequestObject$`vehicle`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "points": [%s],
           "from_points": [%s],
           "to_points": [%s],
           "point_hints": [%s],
           "from_point_hints": [%s],
           "to_point_hints": [%s],
           "out_arrays": [%s],
           "vehicle": %s
        }',
        lapply(self$`points`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`from_points`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`to_points`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`point_hints`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`from_point_hints`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`to_point_hints`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`out_arrays`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`vehicle`
      )
    },
    fromJSONString = function(MatrixRequestJson) {
      MatrixRequestObject <- jsonlite::fromJSON(MatrixRequestJson)
      self$`points` <- lapply(MatrixRequestObject$`points`, function(x) Numeric$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`from_points` <- lapply(MatrixRequestObject$`from_points`, function(x) Numeric$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`to_points` <- lapply(MatrixRequestObject$`to_points`, function(x) Numeric$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`point_hints` <- MatrixRequestObject$`point_hints`
      self$`from_point_hints` <- MatrixRequestObject$`from_point_hints`
      self$`to_point_hints` <- MatrixRequestObject$`to_point_hints`
      self$`out_arrays` <- MatrixRequestObject$`out_arrays`
      self$`vehicle` <- MatrixRequestObject$`vehicle`
    }
  )
)
