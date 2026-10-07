//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
  /// Returns a new [ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties] instance.
  ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties({
    this.everyoneLimit,
    this.priority,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? everyoneLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priority;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties &&
    other.everyoneLimit == everyoneLimit &&
    other.priority == priority;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (everyoneLimit == null ? 0 : everyoneLimit!.hashCode) +
    (priority == null ? 0 : priority!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties[everyoneLimit=$everyoneLimit, priority=$priority]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.everyoneLimit != null) {
      json[r'everyoneLimit'] = this.everyoneLimit;
    } else {
      json[r'everyoneLimit'] = null;
    }
    if (this.priority != null) {
      json[r'priority'] = this.priority;
    } else {
      json[r'priority'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(
        everyoneLimit: ConfigNodePropertyInteger.fromJson(json[r'everyoneLimit']),
        priority: ConfigNodePropertyInteger.fromJson(json[r'priority']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

