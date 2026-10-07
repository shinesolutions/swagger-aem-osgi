//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties {
  /// Returns a new [ComAdobeCqSocialNotificationsImplNotificationsRouterProperties] instance.
  ComAdobeCqSocialNotificationsImplNotificationsRouterProperties({
    this.eventPeriodTopics,
    this.eventPeriodFilter,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? eventPeriodTopics;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? eventPeriodFilter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialNotificationsImplNotificationsRouterProperties &&
    other.eventPeriodTopics == eventPeriodTopics &&
    other.eventPeriodFilter == eventPeriodFilter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventPeriodTopics == null ? 0 : eventPeriodTopics!.hashCode) +
    (eventPeriodFilter == null ? 0 : eventPeriodFilter!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialNotificationsImplNotificationsRouterProperties[eventPeriodTopics=$eventPeriodTopics, eventPeriodFilter=$eventPeriodFilter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventPeriodTopics != null) {
      json[r'event.topics'] = this.eventPeriodTopics;
    } else {
      json[r'event.topics'] = null;
    }
    if (this.eventPeriodFilter != null) {
      json[r'event.filter'] = this.eventPeriodFilter;
    } else {
      json[r'event.filter'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialNotificationsImplNotificationsRouterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialNotificationsImplNotificationsRouterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(
        eventPeriodTopics: ConfigNodePropertyString.fromJson(json[r'event.topics']),
        eventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'event.filter']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialNotificationsImplNotificationsRouterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialNotificationsImplNotificationsRouterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialNotificationsImplNotificationsRouterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialNotificationsImplNotificationsRouterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

