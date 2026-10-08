//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {
  /// Returns a new [ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties] instance.
  ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties({
    this.minThreadPoolSize,
    this.maxThreadPoolSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minThreadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxThreadPoolSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties &&
    other.minThreadPoolSize == minThreadPoolSize &&
    other.maxThreadPoolSize == maxThreadPoolSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minThreadPoolSize == null ? 0 : minThreadPoolSize!.hashCode) +
    (maxThreadPoolSize == null ? 0 : maxThreadPoolSize!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties[minThreadPoolSize=$minThreadPoolSize, maxThreadPoolSize=$maxThreadPoolSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.minThreadPoolSize != null) {
      json[r'minThreadPoolSize'] = this.minThreadPoolSize;
    } else {
      json[r'minThreadPoolSize'] = null;
    }
    if (this.maxThreadPoolSize != null) {
      json[r'maxThreadPoolSize'] = this.maxThreadPoolSize;
    } else {
      json[r'maxThreadPoolSize'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(
        minThreadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'minThreadPoolSize']),
        maxThreadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'maxThreadPoolSize']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

