//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties {
  /// Returns a new [ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties] instance.
  ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties({
    this.path,
    this.servicePeriodRanking,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties &&
    other.path == path &&
    other.servicePeriodRanking == servicePeriodRanking;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties[path=$path, servicePeriodRanking=$servicePeriodRanking]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

