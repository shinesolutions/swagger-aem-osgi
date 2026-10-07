//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] instance.
  ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties({
    this.watchwordsPeriodPositive,
    this.watchwordsPeriodNegative,
    this.watchwordsPeriodPath,
    this.sentimentPeriodPath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? watchwordsPeriodPositive;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? watchwordsPeriodNegative;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? watchwordsPeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? sentimentPeriodPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties &&
    other.watchwordsPeriodPositive == watchwordsPeriodPositive &&
    other.watchwordsPeriodNegative == watchwordsPeriodNegative &&
    other.watchwordsPeriodPath == watchwordsPeriodPath &&
    other.sentimentPeriodPath == sentimentPeriodPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (watchwordsPeriodPositive == null ? 0 : watchwordsPeriodPositive!.hashCode) +
    (watchwordsPeriodNegative == null ? 0 : watchwordsPeriodNegative!.hashCode) +
    (watchwordsPeriodPath == null ? 0 : watchwordsPeriodPath!.hashCode) +
    (sentimentPeriodPath == null ? 0 : sentimentPeriodPath!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties[watchwordsPeriodPositive=$watchwordsPeriodPositive, watchwordsPeriodNegative=$watchwordsPeriodNegative, watchwordsPeriodPath=$watchwordsPeriodPath, sentimentPeriodPath=$sentimentPeriodPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.watchwordsPeriodPositive != null) {
      json[r'watchwords.positive'] = this.watchwordsPeriodPositive;
    } else {
      json[r'watchwords.positive'] = null;
    }
    if (this.watchwordsPeriodNegative != null) {
      json[r'watchwords.negative'] = this.watchwordsPeriodNegative;
    } else {
      json[r'watchwords.negative'] = null;
    }
    if (this.watchwordsPeriodPath != null) {
      json[r'watchwords.path'] = this.watchwordsPeriodPath;
    } else {
      json[r'watchwords.path'] = null;
    }
    if (this.sentimentPeriodPath != null) {
      json[r'sentiment.path'] = this.sentimentPeriodPath;
    } else {
      json[r'sentiment.path'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
        watchwordsPeriodPositive: ConfigNodePropertyArray.fromJson(json[r'watchwords.positive']),
        watchwordsPeriodNegative: ConfigNodePropertyArray.fromJson(json[r'watchwords.negative']),
        watchwordsPeriodPath: ConfigNodePropertyString.fromJson(json[r'watchwords.path']),
        sentimentPeriodPath: ConfigNodePropertyString.fromJson(json[r'sentiment.path']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

