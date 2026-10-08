//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqMailerImplCqMailingServiceProperties {
  /// Returns a new [ComDayCqMailerImplCqMailingServiceProperties] instance.
  ComDayCqMailerImplCqMailingServiceProperties({
    this.maxPeriodRecipientPeriodCount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? maxPeriodRecipientPeriodCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqMailerImplCqMailingServiceProperties &&
    other.maxPeriodRecipientPeriodCount == maxPeriodRecipientPeriodCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxPeriodRecipientPeriodCount == null ? 0 : maxPeriodRecipientPeriodCount!.hashCode);

  @override
  String toString() => 'ComDayCqMailerImplCqMailingServiceProperties[maxPeriodRecipientPeriodCount=$maxPeriodRecipientPeriodCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxPeriodRecipientPeriodCount != null) {
      json[r'max.recipient.count'] = this.maxPeriodRecipientPeriodCount;
    } else {
      json[r'max.recipient.count'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqMailerImplCqMailingServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqMailerImplCqMailingServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqMailerImplCqMailingServiceProperties(
        maxPeriodRecipientPeriodCount: ConfigNodePropertyString.fromJson(json[r'max.recipient.count']),
      );
    }
    return null;
  }

  static List<ComDayCqMailerImplCqMailingServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqMailerImplCqMailingServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqMailerImplCqMailingServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqMailerImplCqMailingServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqMailerImplCqMailingServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqMailerImplCqMailingServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqMailerImplCqMailingServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCqMailerImplCqMailingServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqMailerImplCqMailingServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqMailerImplCqMailingServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

