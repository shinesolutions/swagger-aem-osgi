//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAcpPlatformPlatformServletProperties {
  /// Returns a new [ComAdobeGraniteAcpPlatformPlatformServletProperties] instance.
  ComAdobeGraniteAcpPlatformPlatformServletProperties({
    this.queryPeriodLimit,
    this.filePeriodTypePeriodExtensionPeriodMap,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queryPeriodLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filePeriodTypePeriodExtensionPeriodMap;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAcpPlatformPlatformServletProperties &&
    other.queryPeriodLimit == queryPeriodLimit &&
    other.filePeriodTypePeriodExtensionPeriodMap == filePeriodTypePeriodExtensionPeriodMap;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (queryPeriodLimit == null ? 0 : queryPeriodLimit!.hashCode) +
    (filePeriodTypePeriodExtensionPeriodMap == null ? 0 : filePeriodTypePeriodExtensionPeriodMap!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAcpPlatformPlatformServletProperties[queryPeriodLimit=$queryPeriodLimit, filePeriodTypePeriodExtensionPeriodMap=$filePeriodTypePeriodExtensionPeriodMap]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.queryPeriodLimit != null) {
      json[r'query.limit'] = this.queryPeriodLimit;
    } else {
      json[r'query.limit'] = null;
    }
    if (this.filePeriodTypePeriodExtensionPeriodMap != null) {
      json[r'file.type.extension.map'] = this.filePeriodTypePeriodExtensionPeriodMap;
    } else {
      json[r'file.type.extension.map'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAcpPlatformPlatformServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAcpPlatformPlatformServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAcpPlatformPlatformServletProperties(
        queryPeriodLimit: ConfigNodePropertyInteger.fromJson(json[r'query.limit']),
        filePeriodTypePeriodExtensionPeriodMap: ConfigNodePropertyArray.fromJson(json[r'file.type.extension.map']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAcpPlatformPlatformServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAcpPlatformPlatformServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAcpPlatformPlatformServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAcpPlatformPlatformServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAcpPlatformPlatformServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAcpPlatformPlatformServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAcpPlatformPlatformServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAcpPlatformPlatformServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAcpPlatformPlatformServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAcpPlatformPlatformServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

