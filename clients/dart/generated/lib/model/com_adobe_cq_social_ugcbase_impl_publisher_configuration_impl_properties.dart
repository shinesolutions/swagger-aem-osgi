//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties] instance.
  ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties({
    this.isPrimaryPublisher,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? isPrimaryPublisher;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties &&
    other.isPrimaryPublisher == isPrimaryPublisher;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isPrimaryPublisher == null ? 0 : isPrimaryPublisher!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties[isPrimaryPublisher=$isPrimaryPublisher]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isPrimaryPublisher != null) {
      json[r'isPrimaryPublisher'] = this.isPrimaryPublisher;
    } else {
      json[r'isPrimaryPublisher'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(
        isPrimaryPublisher: ConfigNodePropertyBoolean.fromJson(json[r'isPrimaryPublisher']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

