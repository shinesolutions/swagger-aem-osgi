//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties.g.dart';

/// ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
///
/// Properties:
/// * [linkcheckertransformerPeriodDisableRewriting] 
/// * [linkcheckertransformerPeriodDisableChecking] 
/// * [linkcheckertransformerPeriodMapCacheSize] 
/// * [linkcheckertransformerPeriodStrictExtensionCheck] 
/// * [linkcheckertransformerPeriodStripHtmltExtension] 
/// * [linkcheckertransformerPeriodRewriteElements] 
/// * [linkcheckertransformerPeriodStripExtensionPathBlacklist] 
@BuiltValue()
abstract class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties implements Built<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'linkcheckertransformer.disableRewriting')
  ConfigNodePropertyBoolean? get linkcheckertransformerPeriodDisableRewriting;

  @BuiltValueField(wireName: r'linkcheckertransformer.disableChecking')
  ConfigNodePropertyBoolean? get linkcheckertransformerPeriodDisableChecking;

  @BuiltValueField(wireName: r'linkcheckertransformer.mapCacheSize')
  ConfigNodePropertyInteger? get linkcheckertransformerPeriodMapCacheSize;

  @BuiltValueField(wireName: r'linkcheckertransformer.strictExtensionCheck')
  ConfigNodePropertyBoolean? get linkcheckertransformerPeriodStrictExtensionCheck;

  @BuiltValueField(wireName: r'linkcheckertransformer.stripHtmltExtension')
  ConfigNodePropertyBoolean? get linkcheckertransformerPeriodStripHtmltExtension;

  @BuiltValueField(wireName: r'linkcheckertransformer.rewriteElements')
  ConfigNodePropertyArray? get linkcheckertransformerPeriodRewriteElements;

  @BuiltValueField(wireName: r'linkcheckertransformer.stripExtensionPathBlacklist')
  ConfigNodePropertyArray? get linkcheckertransformerPeriodStripExtensionPathBlacklist;

  ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties._();

  factory ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties([void updates(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder b)]) = _$ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties> get serializer => _$ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesSerializer();
}

class _$ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties, _$ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties];

  @override
  final String wireName = r'ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.linkcheckertransformerPeriodDisableRewriting != null) {
      yield r'linkcheckertransformer.disableRewriting';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodDisableRewriting,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkcheckertransformerPeriodDisableChecking != null) {
      yield r'linkcheckertransformer.disableChecking';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodDisableChecking,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkcheckertransformerPeriodMapCacheSize != null) {
      yield r'linkcheckertransformer.mapCacheSize';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodMapCacheSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.linkcheckertransformerPeriodStrictExtensionCheck != null) {
      yield r'linkcheckertransformer.strictExtensionCheck';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodStrictExtensionCheck,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkcheckertransformerPeriodStripHtmltExtension != null) {
      yield r'linkcheckertransformer.stripHtmltExtension';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodStripHtmltExtension,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkcheckertransformerPeriodRewriteElements != null) {
      yield r'linkcheckertransformer.rewriteElements';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodRewriteElements,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.linkcheckertransformerPeriodStripExtensionPathBlacklist != null) {
      yield r'linkcheckertransformer.stripExtensionPathBlacklist';
      yield serializers.serialize(
        object.linkcheckertransformerPeriodStripExtensionPathBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'linkcheckertransformer.disableRewriting':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodDisableRewriting.replace(valueDes);
          break;
        case r'linkcheckertransformer.disableChecking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodDisableChecking.replace(valueDes);
          break;
        case r'linkcheckertransformer.mapCacheSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodMapCacheSize.replace(valueDes);
          break;
        case r'linkcheckertransformer.strictExtensionCheck':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodStrictExtensionCheck.replace(valueDes);
          break;
        case r'linkcheckertransformer.stripHtmltExtension':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodStripHtmltExtension.replace(valueDes);
          break;
        case r'linkcheckertransformer.rewriteElements':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodRewriteElements.replace(valueDes);
          break;
        case r'linkcheckertransformer.stripExtensionPathBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.linkcheckertransformerPeriodStripExtensionPathBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder();
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

