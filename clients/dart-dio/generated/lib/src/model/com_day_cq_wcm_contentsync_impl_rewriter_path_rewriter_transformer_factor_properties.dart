//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties.g.dart';

/// ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
///
/// Properties:
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodLinks] 
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodClientlibs] 
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodImages] 
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodAttributePeriodPattern] 
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodPattern] 
/// * [cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodReplace] 
@BuiltValue()
abstract class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties implements Built<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.mapping.links')
  ConfigNodePropertyArray? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodLinks;

  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.mapping.clientlibs')
  ConfigNodePropertyArray? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodClientlibs;

  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.mapping.images')
  ConfigNodePropertyArray? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodImages;

  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.attribute.pattern')
  ConfigNodePropertyString? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodAttributePeriodPattern;

  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.clientlibrary.pattern')
  ConfigNodePropertyString? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodPattern;

  @BuiltValueField(wireName: r'cq.contentsync.pathrewritertransformer.clientlibrary.replace')
  ConfigNodePropertyString? get cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodReplace;

  ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties._();

  factory ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties([void updates(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder b)]) = _$ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties> get serializer => _$ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesSerializer();
}

class _$ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties, _$ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties];

  @override
  final String wireName = r'ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodLinks != null) {
      yield r'cq.contentsync.pathrewritertransformer.mapping.links';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodLinks,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodClientlibs != null) {
      yield r'cq.contentsync.pathrewritertransformer.mapping.clientlibs';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodClientlibs,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodImages != null) {
      yield r'cq.contentsync.pathrewritertransformer.mapping.images';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodImages,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodAttributePeriodPattern != null) {
      yield r'cq.contentsync.pathrewritertransformer.attribute.pattern';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodAttributePeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodPattern != null) {
      yield r'cq.contentsync.pathrewritertransformer.clientlibrary.pattern';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodReplace != null) {
      yield r'cq.contentsync.pathrewritertransformer.clientlibrary.replace';
      yield serializers.serialize(
        object.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodReplace,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.contentsync.pathrewritertransformer.mapping.links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodLinks.replace(valueDes);
          break;
        case r'cq.contentsync.pathrewritertransformer.mapping.clientlibs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodClientlibs.replace(valueDes);
          break;
        case r'cq.contentsync.pathrewritertransformer.mapping.images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodMappingPeriodImages.replace(valueDes);
          break;
        case r'cq.contentsync.pathrewritertransformer.attribute.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodAttributePeriodPattern.replace(valueDes);
          break;
        case r'cq.contentsync.pathrewritertransformer.clientlibrary.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodPattern.replace(valueDes);
          break;
        case r'cq.contentsync.pathrewritertransformer.clientlibrary.replace':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodContentsyncPeriodPathrewritertransformerPeriodClientlibraryPeriodReplace.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder();
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

