//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties.g.dart';

/// ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
///
/// Properties:
/// * [extensionPeriodOrder] 
/// * [flushPeriodForumontopic] 
@BuiltValue()
abstract class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties implements Built<ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties, ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder> {
  @BuiltValueField(wireName: r'extension.order')
  ConfigNodePropertyInteger? get extensionPeriodOrder;

  @BuiltValueField(wireName: r'flush.forumontopic')
  ConfigNodePropertyBoolean? get flushPeriodForumontopic;

  ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties._();

  factory ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties([void updates(ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder b)]) = _$ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties> get serializer => _$ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesSerializer();
}

class _$ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties, _$ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties];

  @override
  final String wireName = r'ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.extensionPeriodOrder != null) {
      yield r'extension.order';
      yield serializers.serialize(
        object.extensionPeriodOrder,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.flushPeriodForumontopic != null) {
      yield r'flush.forumontopic';
      yield serializers.serialize(
        object.flushPeriodForumontopic,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'extension.order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.extensionPeriodOrder.replace(valueDes);
          break;
        case r'flush.forumontopic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.flushPeriodForumontopic.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder();
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

