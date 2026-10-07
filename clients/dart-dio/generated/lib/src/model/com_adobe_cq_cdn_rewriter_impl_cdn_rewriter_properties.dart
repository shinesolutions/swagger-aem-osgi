//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties.g.dart';

/// ComAdobeCqCdnRewriterImplCDNRewriterProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [cdnrewriterPeriodAttributes] 
/// * [cdnPeriodRewriterPeriodDistributionPeriodDomain] 
@BuiltValue()
abstract class ComAdobeCqCdnRewriterImplCDNRewriterProperties implements Built<ComAdobeCqCdnRewriterImplCDNRewriterProperties, ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'cdnrewriter.attributes')
  ConfigNodePropertyArray? get cdnrewriterPeriodAttributes;

  @BuiltValueField(wireName: r'cdn.rewriter.distribution.domain')
  ConfigNodePropertyString? get cdnPeriodRewriterPeriodDistributionPeriodDomain;

  ComAdobeCqCdnRewriterImplCDNRewriterProperties._();

  factory ComAdobeCqCdnRewriterImplCDNRewriterProperties([void updates(ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder b)]) = _$ComAdobeCqCdnRewriterImplCDNRewriterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCdnRewriterImplCDNRewriterProperties> get serializer => _$ComAdobeCqCdnRewriterImplCDNRewriterPropertiesSerializer();
}

class _$ComAdobeCqCdnRewriterImplCDNRewriterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCdnRewriterImplCDNRewriterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCdnRewriterImplCDNRewriterProperties, _$ComAdobeCqCdnRewriterImplCDNRewriterProperties];

  @override
  final String wireName = r'ComAdobeCqCdnRewriterImplCDNRewriterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCdnRewriterImplCDNRewriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
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
    ComAdobeCqCdnRewriterImplCDNRewriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder result,
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
  ComAdobeCqCdnRewriterImplCDNRewriterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder();
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

