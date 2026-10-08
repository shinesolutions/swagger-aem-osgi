//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeOctopusNcommBootstrapProperties {
  /// Returns a new [ComAdobeOctopusNcommBootstrapProperties] instance.
  ComAdobeOctopusNcommBootstrapProperties({
    this.maxConnections,
    this.maxRequests,
    this.requestTimeout,
    this.requestRetries,
    this.launchTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxConnections;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxRequests;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? requestTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? requestRetries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? launchTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeOctopusNcommBootstrapProperties &&
    other.maxConnections == maxConnections &&
    other.maxRequests == maxRequests &&
    other.requestTimeout == requestTimeout &&
    other.requestRetries == requestRetries &&
    other.launchTimeout == launchTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxConnections == null ? 0 : maxConnections!.hashCode) +
    (maxRequests == null ? 0 : maxRequests!.hashCode) +
    (requestTimeout == null ? 0 : requestTimeout!.hashCode) +
    (requestRetries == null ? 0 : requestRetries!.hashCode) +
    (launchTimeout == null ? 0 : launchTimeout!.hashCode);

  @override
  String toString() => 'ComAdobeOctopusNcommBootstrapProperties[maxConnections=$maxConnections, maxRequests=$maxRequests, requestTimeout=$requestTimeout, requestRetries=$requestRetries, launchTimeout=$launchTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxConnections != null) {
      json[r'maxConnections'] = this.maxConnections;
    } else {
      json[r'maxConnections'] = null;
    }
    if (this.maxRequests != null) {
      json[r'maxRequests'] = this.maxRequests;
    } else {
      json[r'maxRequests'] = null;
    }
    if (this.requestTimeout != null) {
      json[r'requestTimeout'] = this.requestTimeout;
    } else {
      json[r'requestTimeout'] = null;
    }
    if (this.requestRetries != null) {
      json[r'requestRetries'] = this.requestRetries;
    } else {
      json[r'requestRetries'] = null;
    }
    if (this.launchTimeout != null) {
      json[r'launchTimeout'] = this.launchTimeout;
    } else {
      json[r'launchTimeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeOctopusNcommBootstrapProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeOctopusNcommBootstrapProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeOctopusNcommBootstrapProperties(
        maxConnections: ConfigNodePropertyInteger.fromJson(json[r'maxConnections']),
        maxRequests: ConfigNodePropertyInteger.fromJson(json[r'maxRequests']),
        requestTimeout: ConfigNodePropertyInteger.fromJson(json[r'requestTimeout']),
        requestRetries: ConfigNodePropertyInteger.fromJson(json[r'requestRetries']),
        launchTimeout: ConfigNodePropertyInteger.fromJson(json[r'launchTimeout']),
      );
    }
    return null;
  }

  static List<ComAdobeOctopusNcommBootstrapProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeOctopusNcommBootstrapProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeOctopusNcommBootstrapProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeOctopusNcommBootstrapProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeOctopusNcommBootstrapProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeOctopusNcommBootstrapProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeOctopusNcommBootstrapProperties-objects as value to a dart map
  static Map<String, List<ComAdobeOctopusNcommBootstrapProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeOctopusNcommBootstrapProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeOctopusNcommBootstrapProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

