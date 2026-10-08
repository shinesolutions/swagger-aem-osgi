//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'messaging_user_component_factory_properties.g.dart';

/// MessagingUserComponentFactoryProperties
///
/// Properties:
/// * [priority] 
@BuiltValue()
abstract class MessagingUserComponentFactoryProperties implements Built<MessagingUserComponentFactoryProperties, MessagingUserComponentFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  MessagingUserComponentFactoryProperties._();

  factory MessagingUserComponentFactoryProperties([void updates(MessagingUserComponentFactoryPropertiesBuilder b)]) = _$MessagingUserComponentFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessagingUserComponentFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessagingUserComponentFactoryProperties> get serializer => _$MessagingUserComponentFactoryPropertiesSerializer();
}

class _$MessagingUserComponentFactoryPropertiesSerializer implements PrimitiveSerializer<MessagingUserComponentFactoryProperties> {
  @override
  final Iterable<Type> types = const [MessagingUserComponentFactoryProperties, _$MessagingUserComponentFactoryProperties];

  @override
  final String wireName = r'MessagingUserComponentFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessagingUserComponentFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessagingUserComponentFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessagingUserComponentFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessagingUserComponentFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessagingUserComponentFactoryPropertiesBuilder();
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

