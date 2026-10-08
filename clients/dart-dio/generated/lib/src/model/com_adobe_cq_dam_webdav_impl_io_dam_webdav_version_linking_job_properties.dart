//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties.g.dart';

/// ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
///
/// Properties:
/// * [cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable] 
/// * [cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod] 
/// * [cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout] 
@BuiltValue()
abstract class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties implements Built<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.webdav.version.linking.enable')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable;

  @BuiltValueField(wireName: r'cq.dam.webdav.version.linking.scheduler.period')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod;

  @BuiltValueField(wireName: r'cq.dam.webdav.version.linking.staging.timeout')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout;

  ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties._();

  factory ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties([void updates(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder b)]) = _$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties> get serializer => _$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesSerializer();
}

class _$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties, _$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties];

  @override
  final String wireName = r'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable != null) {
      yield r'cq.dam.webdav.version.linking.enable';
      yield serializers.serialize(
        object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod != null) {
      yield r'cq.dam.webdav.version.linking.scheduler.period';
      yield serializers.serialize(
        object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout != null) {
      yield r'cq.dam.webdav.version.linking.staging.timeout';
      yield serializers.serialize(
        object.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.webdav.version.linking.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable.replace(valueDes);
          break;
        case r'cq.dam.webdav.version.linking.scheduler.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod.replace(valueDes);
          break;
        case r'cq.dam.webdav.version.linking.staging.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder();
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

