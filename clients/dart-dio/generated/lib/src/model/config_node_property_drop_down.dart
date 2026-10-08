//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down_type.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'config_node_property_drop_down.g.dart';

/// ConfigNodePropertyDropDown
///
/// Properties:
/// * [name] - property name
/// * [optional] - True if optional
/// * [isSet] - True if property is set
/// * [type] 
/// * [value] - Property value
/// * [description] - Property description
@BuiltValue()
abstract class ConfigNodePropertyDropDown implements Built<ConfigNodePropertyDropDown, ConfigNodePropertyDropDownBuilder> {
  /// property name
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// True if optional
  @BuiltValueField(wireName: r'optional')
  bool? get optional;

  /// True if property is set
  @BuiltValueField(wireName: r'is_set')
  bool? get isSet;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDownType? get type;

  /// Property value
  @BuiltValueField(wireName: r'value')
  JsonObject? get value;

  /// Property description
  @BuiltValueField(wireName: r'description')
  String? get description;

  ConfigNodePropertyDropDown._();

  factory ConfigNodePropertyDropDown([void updates(ConfigNodePropertyDropDownBuilder b)]) = _$ConfigNodePropertyDropDown;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConfigNodePropertyDropDownBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConfigNodePropertyDropDown> get serializer => _$ConfigNodePropertyDropDownSerializer();
}

class _$ConfigNodePropertyDropDownSerializer implements PrimitiveSerializer<ConfigNodePropertyDropDown> {
  @override
  final Iterable<Type> types = const [ConfigNodePropertyDropDown, _$ConfigNodePropertyDropDown];

  @override
  final String wireName = r'ConfigNodePropertyDropDown';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConfigNodePropertyDropDown object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.optional != null) {
      yield r'optional';
      yield serializers.serialize(
        object.optional,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isSet != null) {
      yield r'is_set';
      yield serializers.serialize(
        object.isSet,
        specifiedType: const FullType(bool),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(ConfigNodePropertyDropDownType),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConfigNodePropertyDropDown object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConfigNodePropertyDropDownBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'optional':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.optional = valueDes;
          break;
        case r'is_set':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isSet = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDownType),
          ) as ConfigNodePropertyDropDownType?;
          if (valueDes == null) continue;
          result.type.replace(valueDes);
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConfigNodePropertyDropDown deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConfigNodePropertyDropDownBuilder();
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

