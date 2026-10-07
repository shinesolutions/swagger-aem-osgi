//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'config_node_property_array.g.dart';

/// ConfigNodePropertyArray
///
/// Properties:
/// * [name] - property name
/// * [optional] - True if optional
/// * [isSet] - True if property is set
/// * [type] - Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
/// * [values] - Property value
/// * [description] - Property description
@BuiltValue()
abstract class ConfigNodePropertyArray implements Built<ConfigNodePropertyArray, ConfigNodePropertyArrayBuilder> {
  /// property name
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// True if optional
  @BuiltValueField(wireName: r'optional')
  bool? get optional;

  /// True if property is set
  @BuiltValueField(wireName: r'is_set')
  bool? get isSet;

  /// Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
  @BuiltValueField(wireName: r'type')
  int? get type;

  /// Property value
  @BuiltValueField(wireName: r'values')
  BuiltList<String>? get values;

  /// Property description
  @BuiltValueField(wireName: r'description')
  String? get description;

  ConfigNodePropertyArray._();

  factory ConfigNodePropertyArray([void updates(ConfigNodePropertyArrayBuilder b)]) = _$ConfigNodePropertyArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConfigNodePropertyArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConfigNodePropertyArray> get serializer => _$ConfigNodePropertyArraySerializer();
}

class _$ConfigNodePropertyArraySerializer implements PrimitiveSerializer<ConfigNodePropertyArray> {
  @override
  final Iterable<Type> types = const [ConfigNodePropertyArray, _$ConfigNodePropertyArray];

  @override
  final String wireName = r'ConfigNodePropertyArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConfigNodePropertyArray object, {
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
        specifiedType: const FullType(int),
      );
    }
    if (object.values != null) {
      yield r'values';
      yield serializers.serialize(
        object.values,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
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
    ConfigNodePropertyArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConfigNodePropertyArrayBuilder result,
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
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.values.replace(valueDes);
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
  ConfigNodePropertyArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConfigNodePropertyArrayBuilder();
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

