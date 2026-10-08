//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {
  /// Returns a new [OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties] instance.
  OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties({
    this.enabledActions,
    this.userPrivilegeNames,
    this.groupPrivilegeNames,
    this.constraint,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? enabledActions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? userPrivilegeNames;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? groupPrivilegeNames;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? constraint;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties &&
    other.enabledActions == enabledActions &&
    other.userPrivilegeNames == userPrivilegeNames &&
    other.groupPrivilegeNames == groupPrivilegeNames &&
    other.constraint == constraint;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabledActions == null ? 0 : enabledActions!.hashCode) +
    (userPrivilegeNames == null ? 0 : userPrivilegeNames!.hashCode) +
    (groupPrivilegeNames == null ? 0 : groupPrivilegeNames!.hashCode) +
    (constraint == null ? 0 : constraint!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties[enabledActions=$enabledActions, userPrivilegeNames=$userPrivilegeNames, groupPrivilegeNames=$groupPrivilegeNames, constraint=$constraint]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabledActions != null) {
      json[r'enabledActions'] = this.enabledActions;
    } else {
      json[r'enabledActions'] = null;
    }
    if (this.userPrivilegeNames != null) {
      json[r'userPrivilegeNames'] = this.userPrivilegeNames;
    } else {
      json[r'userPrivilegeNames'] = null;
    }
    if (this.groupPrivilegeNames != null) {
      json[r'groupPrivilegeNames'] = this.groupPrivilegeNames;
    } else {
      json[r'groupPrivilegeNames'] = null;
    }
    if (this.constraint != null) {
      json[r'constraint'] = this.constraint;
    } else {
      json[r'constraint'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
        enabledActions: ConfigNodePropertyDropDown.fromJson(json[r'enabledActions']),
        userPrivilegeNames: ConfigNodePropertyArray.fromJson(json[r'userPrivilegeNames']),
        groupPrivilegeNames: ConfigNodePropertyArray.fromJson(json[r'groupPrivilegeNames']),
        constraint: ConfigNodePropertyString.fromJson(json[r'constraint']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

