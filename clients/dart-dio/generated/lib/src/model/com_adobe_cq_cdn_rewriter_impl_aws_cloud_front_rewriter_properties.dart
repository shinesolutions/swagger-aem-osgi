//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties.g.dart';

/// ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [keypairPeriodId] 
/// * [keypairPeriodAlias] 
/// * [cdnrewriterPeriodAttributes] 
/// * [cdnPeriodRewriterPeriodDistributionPeriodDomain] 
@BuiltValue()
abstract class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties implements Built<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'keypair.id')
  ConfigNodePropertyString? get keypairPeriodId;

  @BuiltValueField(wireName: r'keypair.alias')
  ConfigNodePropertyString? get keypairPeriodAlias;

  @BuiltValueField(wireName: r'cdnrewriter.attributes')
  ConfigNodePropertyArray? get cdnrewriterPeriodAttributes;

  @BuiltValueField(wireName: r'cdn.rewriter.distribution.domain')
  ConfigNodePropertyString? get cdnPeriodRewriterPeriodDistributionPeriodDomain;

  ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties._();

  factory ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties([void updates(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder b)]) = _$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties> get serializer => _$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesSerializer();
}

class _$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties, _$ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties];

  @override
  final String wireName = r'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.keypairPeriodId != null) {
      yield r'keypair.id';
      yield serializers.serialize(
        object.keypairPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.keypairPeriodAlias != null) {
      yield r'keypair.alias';
      yield serializers.serialize(
        object.keypairPeriodAlias,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cdnrewriterPeriodAttributes != null) {
      yield r'cdnrewriter.attributes';
      yield serializers.serialize(
        object.cdnrewriterPeriodAttributes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cdnPeriodRewriterPeriodDistributionPeriodDomain != null) {
      yield r'cdn.rewriter.distribution.domain';
      yield serializers.serialize(
        object.cdnPeriodRewriterPeriodDistributionPeriodDomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'keypair.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.keypairPeriodId.replace(valueDes);
          break;
        case r'keypair.alias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.keypairPeriodAlias.replace(valueDes);
          break;
        case r'cdnrewriter.attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cdnrewriterPeriodAttributes.replace(valueDes);
          break;
        case r'cdn.rewriter.distribution.domain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cdnPeriodRewriterPeriodDistributionPeriodDomain.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder();
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

