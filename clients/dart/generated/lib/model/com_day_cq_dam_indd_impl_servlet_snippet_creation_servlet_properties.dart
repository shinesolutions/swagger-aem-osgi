//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamInddImplServletSnippetCreationServletProperties {
  /// Returns a new [ComDayCqDamInddImplServletSnippetCreationServletProperties] instance.
  ComDayCqDamInddImplServletSnippetCreationServletProperties({
    this.snippetcreationPeriodMaxcollections,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? snippetcreationPeriodMaxcollections;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamInddImplServletSnippetCreationServletProperties &&
    other.snippetcreationPeriodMaxcollections == snippetcreationPeriodMaxcollections;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (snippetcreationPeriodMaxcollections == null ? 0 : snippetcreationPeriodMaxcollections!.hashCode);

  @override
  String toString() => 'ComDayCqDamInddImplServletSnippetCreationServletProperties[snippetcreationPeriodMaxcollections=$snippetcreationPeriodMaxcollections]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.snippetcreationPeriodMaxcollections != null) {
      json[r'snippetcreation.maxcollections'] = this.snippetcreationPeriodMaxcollections;
    } else {
      json[r'snippetcreation.maxcollections'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamInddImplServletSnippetCreationServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamInddImplServletSnippetCreationServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamInddImplServletSnippetCreationServletProperties(
        snippetcreationPeriodMaxcollections: ConfigNodePropertyInteger.fromJson(json[r'snippetcreation.maxcollections']),
      );
    }
    return null;
  }

  static List<ComDayCqDamInddImplServletSnippetCreationServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamInddImplServletSnippetCreationServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamInddImplServletSnippetCreationServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamInddImplServletSnippetCreationServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamInddImplServletSnippetCreationServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamInddImplServletSnippetCreationServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamInddImplServletSnippetCreationServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamInddImplServletSnippetCreationServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamInddImplServletSnippetCreationServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamInddImplServletSnippetCreationServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

