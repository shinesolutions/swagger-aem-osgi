//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {
  /// Returns a new [ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties] instance.
  ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties({
    this.fromPeriodAddress,
    this.senderPeriodHost,
    this.maxPeriodBouncePeriodCount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? fromPeriodAddress;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? senderPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? maxPeriodBouncePeriodCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties &&
    other.fromPeriodAddress == fromPeriodAddress &&
    other.senderPeriodHost == senderPeriodHost &&
    other.maxPeriodBouncePeriodCount == maxPeriodBouncePeriodCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fromPeriodAddress == null ? 0 : fromPeriodAddress!.hashCode) +
    (senderPeriodHost == null ? 0 : senderPeriodHost!.hashCode) +
    (maxPeriodBouncePeriodCount == null ? 0 : maxPeriodBouncePeriodCount!.hashCode);

  @override
  String toString() => 'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties[fromPeriodAddress=$fromPeriodAddress, senderPeriodHost=$senderPeriodHost, maxPeriodBouncePeriodCount=$maxPeriodBouncePeriodCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fromPeriodAddress != null) {
      json[r'from.address'] = this.fromPeriodAddress;
    } else {
      json[r'from.address'] = null;
    }
    if (this.senderPeriodHost != null) {
      json[r'sender.host'] = this.senderPeriodHost;
    } else {
      json[r'sender.host'] = null;
    }
    if (this.maxPeriodBouncePeriodCount != null) {
      json[r'max.bounce.count'] = this.maxPeriodBouncePeriodCount;
    } else {
      json[r'max.bounce.count'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(
        fromPeriodAddress: ConfigNodePropertyString.fromJson(json[r'from.address']),
        senderPeriodHost: ConfigNodePropertyString.fromJson(json[r'sender.host']),
        maxPeriodBouncePeriodCount: ConfigNodePropertyString.fromJson(json[r'max.bounce.count']),
      );
    }
    return null;
  }

  static List<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

