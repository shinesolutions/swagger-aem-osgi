//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_sync_impl_publisher_sync_service_impl_properties.g.dart';

/// ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
///
/// Properties:
/// * [activeRunModes] 
@BuiltValue()
abstract class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties implements Built<ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties, ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'activeRunModes')
  ConfigNodePropertyArray? get activeRunModes;

  ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties._();

  factory ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties([void updates(ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder b)]) = _$ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties> get serializer => _$ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesSerializer();
}

class _$ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties, _$ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.activeRunModes != null) {
      yield r'activeRunModes';
      yield serializers.serialize(
        object.activeRunModes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'activeRunModes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.activeRunModes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder();
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

