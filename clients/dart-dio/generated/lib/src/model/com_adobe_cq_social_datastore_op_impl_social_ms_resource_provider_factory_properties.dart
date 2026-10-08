//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties.g.dart';

/// ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
///
/// Properties:
/// * [solrPeriodZkPeriodTimeout] 
/// * [solrPeriodCommit] 
/// * [cachePeriodOn] 
/// * [concurrencyPeriodLevel] 
/// * [cachePeriodStartPeriodSize] 
/// * [cachePeriodTtl] 
/// * [cachePeriodSize] 
@BuiltValue()
abstract class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties implements Built<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'solr.zk.timeout')
  ConfigNodePropertyString? get solrPeriodZkPeriodTimeout;

  @BuiltValueField(wireName: r'solr.commit')
  ConfigNodePropertyString? get solrPeriodCommit;

  @BuiltValueField(wireName: r'cache.on')
  ConfigNodePropertyBoolean? get cachePeriodOn;

  @BuiltValueField(wireName: r'concurrency.level')
  ConfigNodePropertyInteger? get concurrencyPeriodLevel;

  @BuiltValueField(wireName: r'cache.start.size')
  ConfigNodePropertyInteger? get cachePeriodStartPeriodSize;

  @BuiltValueField(wireName: r'cache.ttl')
  ConfigNodePropertyInteger? get cachePeriodTtl;

  @BuiltValueField(wireName: r'cache.size')
  ConfigNodePropertyInteger? get cachePeriodSize;

  ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties._();

  factory ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties([void updates(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder b)]) = _$ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties> get serializer => _$ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesSerializer();
}

class _$ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties, _$ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties];

  @override
  final String wireName = r'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.solrPeriodZkPeriodTimeout != null) {
      yield r'solr.zk.timeout';
      yield serializers.serialize(
        object.solrPeriodZkPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.solrPeriodCommit != null) {
      yield r'solr.commit';
      yield serializers.serialize(
        object.solrPeriodCommit,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cachePeriodOn != null) {
      yield r'cache.on';
      yield serializers.serialize(
        object.cachePeriodOn,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.concurrencyPeriodLevel != null) {
      yield r'concurrency.level';
      yield serializers.serialize(
        object.concurrencyPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodStartPeriodSize != null) {
      yield r'cache.start.size';
      yield serializers.serialize(
        object.cachePeriodStartPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodTtl != null) {
      yield r'cache.ttl';
      yield serializers.serialize(
        object.cachePeriodTtl,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodSize != null) {
      yield r'cache.size';
      yield serializers.serialize(
        object.cachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'solr.zk.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodZkPeriodTimeout.replace(valueDes);
          break;
        case r'solr.commit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodCommit.replace(valueDes);
          break;
        case r'cache.on':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cachePeriodOn.replace(valueDes);
          break;
        case r'concurrency.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.concurrencyPeriodLevel.replace(valueDes);
          break;
        case r'cache.start.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodStartPeriodSize.replace(valueDes);
          break;
        case r'cache.ttl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodTtl.replace(valueDes);
          break;
        case r'cache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder();
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

