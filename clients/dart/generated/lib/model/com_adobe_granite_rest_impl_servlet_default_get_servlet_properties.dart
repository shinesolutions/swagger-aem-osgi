//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRestImplServletDefaultGETServletProperties {
  /// Returns a new [ComAdobeGraniteRestImplServletDefaultGETServletProperties] instance.
  ComAdobeGraniteRestImplServletDefaultGETServletProperties({
    this.defaultPeriodLimit,
    this.usePeriodAbsolutePeriodUri,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? defaultPeriodLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? usePeriodAbsolutePeriodUri;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRestImplServletDefaultGETServletProperties &&
    other.defaultPeriodLimit == defaultPeriodLimit &&
    other.usePeriodAbsolutePeriodUri == usePeriodAbsolutePeriodUri;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (defaultPeriodLimit == null ? 0 : defaultPeriodLimit!.hashCode) +
    (usePeriodAbsolutePeriodUri == null ? 0 : usePeriodAbsolutePeriodUri!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRestImplServletDefaultGETServletProperties[defaultPeriodLimit=$defaultPeriodLimit, usePeriodAbsolutePeriodUri=$usePeriodAbsolutePeriodUri]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.defaultPeriodLimit != null) {
      json[r'default.limit'] = this.defaultPeriodLimit;
    } else {
      json[r'default.limit'] = null;
    }
    if (this.usePeriodAbsolutePeriodUri != null) {
      json[r'use.absolute.uri'] = this.usePeriodAbsolutePeriodUri;
    } else {
      json[r'use.absolute.uri'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRestImplServletDefaultGETServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRestImplServletDefaultGETServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRestImplServletDefaultGETServletProperties(
        defaultPeriodLimit: ConfigNodePropertyInteger.fromJson(json[r'default.limit']),
        usePeriodAbsolutePeriodUri: ConfigNodePropertyBoolean.fromJson(json[r'use.absolute.uri']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRestImplServletDefaultGETServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRestImplServletDefaultGETServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRestImplServletDefaultGETServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRestImplServletDefaultGETServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRestImplServletDefaultGETServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRestImplServletDefaultGETServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRestImplServletDefaultGETServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRestImplServletDefaultGETServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRestImplServletDefaultGETServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRestImplServletDefaultGETServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

