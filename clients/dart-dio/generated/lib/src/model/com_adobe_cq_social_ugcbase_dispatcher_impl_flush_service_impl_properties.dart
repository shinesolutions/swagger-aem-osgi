//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties.g.dart';

/// ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
///
/// Properties:
/// * [threadPoolSize] 
/// * [delayTime] 
/// * [workerSleepTime] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties implements Built<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'threadPoolSize')
  ConfigNodePropertyInteger? get threadPoolSize;

  @BuiltValueField(wireName: r'delayTime')
  ConfigNodePropertyInteger? get delayTime;

  @BuiltValueField(wireName: r'workerSleepTime')
  ConfigNodePropertyInteger? get workerSleepTime;

  ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties._();

  factory ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties([void updates(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties> get serializer => _$ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties, _$ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.threadPoolSize != null) {
      yield r'threadPoolSize';
      yield serializers.serialize(
        object.threadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.delayTime != null) {
      yield r'delayTime';
      yield serializers.serialize(
        object.delayTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.workerSleepTime != null) {
      yield r'workerSleepTime';
      yield serializers.serialize(
        object.workerSleepTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'threadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.threadPoolSize.replace(valueDes);
          break;
        case r'delayTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.delayTime.replace(valueDes);
          break;
        case r'workerSleepTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.workerSleepTime.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder();
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

