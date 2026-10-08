//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'config_node_property_drop_down_type.g.dart';

/// ConfigNodePropertyDropDownType
///
/// Properties:
/// * [labels] - Drop Down label
/// * [values] - Drown Down value
@BuiltValue()
abstract class ConfigNodePropertyDropDownType implements Built<ConfigNodePropertyDropDownType, ConfigNodePropertyDropDownTypeBuilder> {
  /// Drop Down label
  @BuiltValueField(wireName: r'labels')
  JsonObject? get labels;

  /// Drown Down value
  @BuiltValueField(wireName: r'values')
  JsonObject? get values;

  ConfigNodePropertyDropDownType._();

  factory ConfigNodePropertyDropDownType([void updates(ConfigNodePropertyDropDownTypeBuilder b)]) = _$ConfigNodePropertyDropDownType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConfigNodePropertyDropDownTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConfigNodePropertyDropDownType> get serializer => _$ConfigNodePropertyDropDownTypeSerializer();
}

class _$ConfigNodePropertyDropDownTypeSerializer implements PrimitiveSerializer<ConfigNodePropertyDropDownType> {
  @override
  final Iterable<Type> types = const [ConfigNodePropertyDropDownType, _$ConfigNodePropertyDropDownType];

  @override
  final String wireName = r'ConfigNodePropertyDropDownType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConfigNodePropertyDropDownType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.labels != null) {
      yield r'labels';
      yield serializers.serialize(
        object.labels,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.values != null) {
      yield r'values';
      yield serializers.serialize(
        object.values,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConfigNodePropertyDropDownType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConfigNodePropertyDropDownTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.labels = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.values = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConfigNodePropertyDropDownType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConfigNodePropertyDropDownTypeBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

