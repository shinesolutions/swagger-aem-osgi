//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo {
  /// Returns a new [ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo] instance.
  ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo({
    this.pid,
    this.title,
    this.description,
    this.properties,
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
  ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties? properties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo &&
    other.pid == pid &&
    other.title == title &&
    other.description == description &&
    other.properties == properties;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pid == null ? 0 : pid!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (properties == null ? 0 : properties!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo[pid=$pid, title=$title, description=$description, properties=$properties]';

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
    return json;
  }

  /// Returns a new [ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo(
        pid: mapValueOfType<String>(json, r'pid'),
        title: mapValueOfType<String>(json, r'title'),
        description: mapValueOfType<String>(json, r'description'),
        properties: ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.fromJson(json[r'properties']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

