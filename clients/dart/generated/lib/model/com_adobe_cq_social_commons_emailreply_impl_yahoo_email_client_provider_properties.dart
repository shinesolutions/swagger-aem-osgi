//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties {
  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties] instance.
  ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties({
    this.priorityOrder,
    this.replyEmailPatterns,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priorityOrder;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? replyEmailPatterns;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties &&
    other.priorityOrder == priorityOrder &&
    other.replyEmailPatterns == replyEmailPatterns;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (priorityOrder == null ? 0 : priorityOrder!.hashCode) +
    (replyEmailPatterns == null ? 0 : replyEmailPatterns!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties[priorityOrder=$priorityOrder, replyEmailPatterns=$replyEmailPatterns]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.priorityOrder != null) {
      json[r'priorityOrder'] = this.priorityOrder;
    } else {
      json[r'priorityOrder'] = null;
    }
    if (this.replyEmailPatterns != null) {
      json[r'replyEmailPatterns'] = this.replyEmailPatterns;
    } else {
      json[r'replyEmailPatterns'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties(
        priorityOrder: ConfigNodePropertyInteger.fromJson(json[r'priorityOrder']),
        replyEmailPatterns: ConfigNodePropertyArray.fromJson(json[r'replyEmailPatterns']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

