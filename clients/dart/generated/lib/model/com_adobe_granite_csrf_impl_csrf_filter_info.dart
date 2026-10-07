//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteCsrfImplCSRFFilterInfo {
  /// Returns a new [ComAdobeGraniteCsrfImplCSRFFilterInfo] instance.
  ComAdobeGraniteCsrfImplCSRFFilterInfo({
    this.pid,
    this.title,
    this.description,
    this.properties,
    this.bundleLocation,
    this.serviceLocation,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pid;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? title;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ComAdobeGraniteCsrfImplCSRFFilterProperties? properties;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? bundleLocation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? serviceLocation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteCsrfImplCSRFFilterInfo &&
    other.pid == pid &&
    other.title == title &&
    other.description == description &&
    other.properties == properties &&
    other.bundleLocation == bundleLocation &&
    other.serviceLocation == serviceLocation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pid == null ? 0 : pid!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (properties == null ? 0 : properties!.hashCode) +
    (bundleLocation == null ? 0 : bundleLocation!.hashCode) +
    (serviceLocation == null ? 0 : serviceLocation!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteCsrfImplCSRFFilterInfo[pid=$pid, title=$title, description=$description, properties=$properties, bundleLocation=$bundleLocation, serviceLocation=$serviceLocation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pid != null) {
      json[r'pid'] = this.pid;
    } else {
      json[r'pid'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.properties != null) {
      json[r'properties'] = this.properties;
    } else {
      json[r'properties'] = null;
    }
    if (this.bundleLocation != null) {
      json[r'bundle_location'] = this.bundleLocation;
    } else {
      json[r'bundle_location'] = null;
    }
    if (this.serviceLocation != null) {
      json[r'service_location'] = this.serviceLocation;
    } else {
      json[r'service_location'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteCsrfImplCSRFFilterInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteCsrfImplCSRFFilterInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteCsrfImplCSRFFilterInfo(
        pid: mapValueOfType<String>(json, r'pid'),
        title: mapValueOfType<String>(json, r'title'),
        description: mapValueOfType<String>(json, r'description'),
        properties: ComAdobeGraniteCsrfImplCSRFFilterProperties.fromJson(json[r'properties']),
        bundleLocation: mapValueOfType<String>(json, r'bundle_location'),
        serviceLocation: mapValueOfType<String>(json, r'service_location'),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteCsrfImplCSRFFilterInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteCsrfImplCSRFFilterInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteCsrfImplCSRFFilterInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteCsrfImplCSRFFilterInfo> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteCsrfImplCSRFFilterInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteCsrfImplCSRFFilterInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteCsrfImplCSRFFilterInfo-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteCsrfImplCSRFFilterInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteCsrfImplCSRFFilterInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteCsrfImplCSRFFilterInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

