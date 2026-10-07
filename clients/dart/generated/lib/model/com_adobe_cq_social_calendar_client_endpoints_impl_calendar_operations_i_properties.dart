//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {
  /// Returns a new [ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties] instance.
  ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties({
    this.maxRetry,
    this.fieldWhitelist,
    this.attachmentTypeBlacklist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxRetry;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? fieldWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? attachmentTypeBlacklist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties &&
    other.maxRetry == maxRetry &&
    other.fieldWhitelist == fieldWhitelist &&
    other.attachmentTypeBlacklist == attachmentTypeBlacklist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxRetry == null ? 0 : maxRetry!.hashCode) +
    (fieldWhitelist == null ? 0 : fieldWhitelist!.hashCode) +
    (attachmentTypeBlacklist == null ? 0 : attachmentTypeBlacklist!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties[maxRetry=$maxRetry, fieldWhitelist=$fieldWhitelist, attachmentTypeBlacklist=$attachmentTypeBlacklist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxRetry != null) {
      json[r'MaxRetry'] = this.maxRetry;
    } else {
      json[r'MaxRetry'] = null;
    }
    if (this.fieldWhitelist != null) {
      json[r'fieldWhitelist'] = this.fieldWhitelist;
    } else {
      json[r'fieldWhitelist'] = null;
    }
    if (this.attachmentTypeBlacklist != null) {
      json[r'attachmentTypeBlacklist'] = this.attachmentTypeBlacklist;
    } else {
      json[r'attachmentTypeBlacklist'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(
        maxRetry: ConfigNodePropertyInteger.fromJson(json[r'MaxRetry']),
        fieldWhitelist: ConfigNodePropertyArray.fromJson(json[r'fieldWhitelist']),
        attachmentTypeBlacklist: ConfigNodePropertyArray.fromJson(json[r'attachmentTypeBlacklist']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

