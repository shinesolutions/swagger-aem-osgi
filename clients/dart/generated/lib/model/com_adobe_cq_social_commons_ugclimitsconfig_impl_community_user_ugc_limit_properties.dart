//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
  /// Returns a new [ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties] instance.
  ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties({
    this.enable,
    this.uGCLimit,
    this.ugcLimitDuration,
    this.domains,
    this.toList,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? uGCLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? ugcLimitDuration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? domains;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? toList;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties &&
    other.enable == enable &&
    other.uGCLimit == uGCLimit &&
    other.ugcLimitDuration == ugcLimitDuration &&
    other.domains == domains &&
    other.toList == toList;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enable == null ? 0 : enable!.hashCode) +
    (uGCLimit == null ? 0 : uGCLimit!.hashCode) +
    (ugcLimitDuration == null ? 0 : ugcLimitDuration!.hashCode) +
    (domains == null ? 0 : domains!.hashCode) +
    (toList == null ? 0 : toList!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties[enable=$enable, uGCLimit=$uGCLimit, ugcLimitDuration=$ugcLimitDuration, domains=$domains, toList=$toList]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enable != null) {
      json[r'enable'] = this.enable;
    } else {
      json[r'enable'] = null;
    }
    if (this.uGCLimit != null) {
      json[r'UGCLimit'] = this.uGCLimit;
    } else {
      json[r'UGCLimit'] = null;
    }
    if (this.ugcLimitDuration != null) {
      json[r'ugcLimitDuration'] = this.ugcLimitDuration;
    } else {
      json[r'ugcLimitDuration'] = null;
    }
    if (this.domains != null) {
      json[r'domains'] = this.domains;
    } else {
      json[r'domains'] = null;
    }
    if (this.toList != null) {
      json[r'toList'] = this.toList;
    } else {
      json[r'toList'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
        enable: ConfigNodePropertyBoolean.fromJson(json[r'enable']),
        uGCLimit: ConfigNodePropertyInteger.fromJson(json[r'UGCLimit']),
        ugcLimitDuration: ConfigNodePropertyInteger.fromJson(json[r'ugcLimitDuration']),
        domains: ConfigNodePropertyArray.fromJson(json[r'domains']),
        toList: ConfigNodePropertyArray.fromJson(json[r'toList']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

