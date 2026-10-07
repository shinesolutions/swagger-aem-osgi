//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties.g.dart';

/// ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
///
/// Properties:
/// * [cdnPeriodConfigPeriodDistributionPeriodDomain] 
/// * [cdnPeriodConfigPeriodEnablePeriodRewriting] 
/// * [cdnPeriodConfigPeriodPathPeriodPrefixes] 
/// * [cdnPeriodConfigPeriodCdnttl] 
/// * [cdnPeriodConfigPeriodApplicationPeriodProtocol] 
@BuiltValue()
abstract class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties implements Built<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties, ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cdn.config.distribution.domain')
  ConfigNodePropertyString? get cdnPeriodConfigPeriodDistributionPeriodDomain;

  @BuiltValueField(wireName: r'cdn.config.enable.rewriting')
  ConfigNodePropertyBoolean? get cdnPeriodConfigPeriodEnablePeriodRewriting;

  @BuiltValueField(wireName: r'cdn.config.path.prefixes')
  ConfigNodePropertyArray? get cdnPeriodConfigPeriodPathPeriodPrefixes;

  @BuiltValueField(wireName: r'cdn.config.cdnttl')
  ConfigNodePropertyInteger? get cdnPeriodConfigPeriodCdnttl;

  @BuiltValueField(wireName: r'cdn.config.application.protocol')
  ConfigNodePropertyString? get cdnPeriodConfigPeriodApplicationPeriodProtocol;

  ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties._();

  factory ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties([void updates(ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder b)]) = _$ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties> get serializer => _$ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesSerializer();
}

class _$ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties, _$ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cdnPeriodConfigPeriodDistributionPeriodDomain != null) {
      yield r'cdn.config.distribution.domain';
      yield serializers.serialize(
        object.cdnPeriodConfigPeriodDistributionPeriodDomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cdnPeriodConfigPeriodEnablePeriodRewriting != null) {
      yield r'cdn.config.enable.rewriting';
      yield serializers.serialize(
        object.cdnPeriodConfigPeriodEnablePeriodRewriting,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cdnPeriodConfigPeriodPathPeriodPrefixes != null) {
      yield r'cdn.config.path.prefixes';
      yield serializers.serialize(
        object.cdnPeriodConfigPeriodPathPeriodPrefixes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cdnPeriodConfigPeriodCdnttl != null) {
      yield r'cdn.config.cdnttl';
      yield serializers.serialize(
        object.cdnPeriodConfigPeriodCdnttl,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cdnPeriodConfigPeriodApplicationPeriodProtocol != null) {
      yield r'cdn.config.application.protocol';
      yield serializers.serialize(
        object.cdnPeriodConfigPeriodApplicationPeriodProtocol,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cdn.config.distribution.domain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cdnPeriodConfigPeriodDistributionPeriodDomain.replace(valueDes);
          break;
        case r'cdn.config.enable.rewriting':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cdnPeriodConfigPeriodEnablePeriodRewriting.replace(valueDes);
          break;
        case r'cdn.config.path.prefixes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cdnPeriodConfigPeriodPathPeriodPrefixes.replace(valueDes);
          break;
        case r'cdn.config.cdnttl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cdnPeriodConfigPeriodCdnttl.replace(valueDes);
          break;
        case r'cdn.config.application.protocol':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cdnPeriodConfigPeriodApplicationPeriodProtocol.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder();
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

