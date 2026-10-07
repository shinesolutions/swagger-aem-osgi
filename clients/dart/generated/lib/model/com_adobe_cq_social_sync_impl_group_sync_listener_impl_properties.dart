//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {
  /// Returns a new [ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties] instance.
  ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties({
    this.nodetypes,
    this.ignorableprops,
    this.ignorablenodes,
    this.enabled,
    this.distfolders,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? nodetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? ignorableprops;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? ignorablenodes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? distfolders;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties &&
    other.nodetypes == nodetypes &&
    other.ignorableprops == ignorableprops &&
    other.ignorablenodes == ignorablenodes &&
    other.enabled == enabled &&
    other.distfolders == distfolders;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (nodetypes == null ? 0 : nodetypes!.hashCode) +
    (ignorableprops == null ? 0 : ignorableprops!.hashCode) +
    (ignorablenodes == null ? 0 : ignorablenodes!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode) +
    (distfolders == null ? 0 : distfolders!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties[nodetypes=$nodetypes, ignorableprops=$ignorableprops, ignorablenodes=$ignorablenodes, enabled=$enabled, distfolders=$distfolders]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.nodetypes != null) {
      json[r'nodetypes'] = this.nodetypes;
    } else {
      json[r'nodetypes'] = null;
    }
    if (this.ignorableprops != null) {
      json[r'ignorableprops'] = this.ignorableprops;
    } else {
      json[r'ignorableprops'] = null;
    }
    if (this.ignorablenodes != null) {
      json[r'ignorablenodes'] = this.ignorablenodes;
    } else {
      json[r'ignorablenodes'] = null;
    }
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.distfolders != null) {
      json[r'distfolders'] = this.distfolders;
    } else {
      json[r'distfolders'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
        nodetypes: ConfigNodePropertyArray.fromJson(json[r'nodetypes']),
        ignorableprops: ConfigNodePropertyArray.fromJson(json[r'ignorableprops']),
        ignorablenodes: ConfigNodePropertyString.fromJson(json[r'ignorablenodes']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        distfolders: ConfigNodePropertyString.fromJson(json[r'distfolders']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

