//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {
  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties] instance.
  ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties({
    this.replyEmailPatterns,
    this.priorityOrder,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? replyEmailPatterns;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priorityOrder;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties &&
    other.replyEmailPatterns == replyEmailPatterns &&
    other.priorityOrder == priorityOrder;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (replyEmailPatterns == null ? 0 : replyEmailPatterns!.hashCode) +
    (priorityOrder == null ? 0 : priorityOrder!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties[replyEmailPatterns=$replyEmailPatterns, priorityOrder=$priorityOrder]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.replyEmailPatterns != null) {
      json[r'replyEmailPatterns'] = this.replyEmailPatterns;
    } else {
      json[r'replyEmailPatterns'] = null;
    }
    if (this.priorityOrder != null) {
      json[r'priorityOrder'] = this.priorityOrder;
    } else {
      json[r'priorityOrder'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(
        replyEmailPatterns: ConfigNodePropertyArray.fromJson(json[r'replyEmailPatterns']),
        priorityOrder: ConfigNodePropertyInteger.fromJson(json[r'priorityOrder']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

