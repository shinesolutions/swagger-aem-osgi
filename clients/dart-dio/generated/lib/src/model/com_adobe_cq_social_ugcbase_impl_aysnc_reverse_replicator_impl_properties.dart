//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties.g.dart';

/// ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
///
/// Properties:
/// * [poolSize] 
/// * [maxPoolSize] 
/// * [queueSize] 
/// * [keepAliveTime] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties implements Built<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'poolSize')
  ConfigNodePropertyInteger? get poolSize;

  @BuiltValueField(wireName: r'maxPoolSize')
  ConfigNodePropertyInteger? get maxPoolSize;

  @BuiltValueField(wireName: r'queueSize')
  ConfigNodePropertyInteger? get queueSize;

  @BuiltValueField(wireName: r'keepAliveTime')
  ConfigNodePropertyInteger? get keepAliveTime;

  ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties._();

  factory ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties([void updates(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties> get serializer => _$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties, _$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.poolSize != null) {
      yield r'poolSize';
      yield serializers.serialize(
        object.poolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPoolSize != null) {
      yield r'maxPoolSize';
      yield serializers.serialize(
        object.maxPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queueSize != null) {
      yield r'queueSize';
      yield serializers.serialize(
        object.queueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.keepAliveTime != null) {
      yield r'keepAliveTime';
      yield serializers.serialize(
        object.keepAliveTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'poolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.poolSize.replace(valueDes);
          break;
        case r'maxPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPoolSize.replace(valueDes);
          break;
        case r'queueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queueSize.replace(valueDes);
          break;
        case r'keepAliveTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.keepAliveTime.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder();
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

