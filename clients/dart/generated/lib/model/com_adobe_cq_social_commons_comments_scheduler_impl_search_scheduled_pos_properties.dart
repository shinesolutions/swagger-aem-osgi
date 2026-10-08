//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {
  /// Returns a new [ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties] instance.
  ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties({
    this.enableScheduledPostsSearch,
    this.numberOfMinutes,
    this.maxSearchLimit,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableScheduledPostsSearch;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? numberOfMinutes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxSearchLimit;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties &&
    other.enableScheduledPostsSearch == enableScheduledPostsSearch &&
    other.numberOfMinutes == numberOfMinutes &&
    other.maxSearchLimit == maxSearchLimit;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enableScheduledPostsSearch == null ? 0 : enableScheduledPostsSearch!.hashCode) +
    (numberOfMinutes == null ? 0 : numberOfMinutes!.hashCode) +
    (maxSearchLimit == null ? 0 : maxSearchLimit!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties[enableScheduledPostsSearch=$enableScheduledPostsSearch, numberOfMinutes=$numberOfMinutes, maxSearchLimit=$maxSearchLimit]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enableScheduledPostsSearch != null) {
      json[r'enableScheduledPostsSearch'] = this.enableScheduledPostsSearch;
    } else {
      json[r'enableScheduledPostsSearch'] = null;
    }
    if (this.numberOfMinutes != null) {
      json[r'numberOfMinutes'] = this.numberOfMinutes;
    } else {
      json[r'numberOfMinutes'] = null;
    }
    if (this.maxSearchLimit != null) {
      json[r'maxSearchLimit'] = this.maxSearchLimit;
    } else {
      json[r'maxSearchLimit'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(
        enableScheduledPostsSearch: ConfigNodePropertyBoolean.fromJson(json[r'enableScheduledPostsSearch']),
        numberOfMinutes: ConfigNodePropertyInteger.fromJson(json[r'numberOfMinutes']),
        maxSearchLimit: ConfigNodePropertyInteger.fromJson(json[r'maxSearchLimit']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

