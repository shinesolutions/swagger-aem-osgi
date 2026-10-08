//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties.g.dart';

/// ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
///
/// Properties:
/// * [servicePeriodMaxLinksPerHost] 
/// * [servicePeriodSaveExternalLinkReferences] 
@BuiltValue()
abstract class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties implements Built<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.max_links_per_host')
  ConfigNodePropertyInteger? get servicePeriodMaxLinksPerHost;

  @BuiltValueField(wireName: r'service.save_external_link_references')
  ConfigNodePropertyBoolean? get servicePeriodSaveExternalLinkReferences;

  ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties._();

  factory ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties([void updates(ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder b)]) = _$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties> get serializer => _$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesSerializer();
}

class _$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties, _$ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties];

  @override
  final String wireName = r'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodMaxLinksPerHost != null) {
      yield r'service.max_links_per_host';
      yield serializers.serialize(
        object.servicePeriodMaxLinksPerHost,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.servicePeriodSaveExternalLinkReferences != null) {
      yield r'service.save_external_link_references';
      yield serializers.serialize(
        object.servicePeriodSaveExternalLinkReferences,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.max_links_per_host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodMaxLinksPerHost.replace(valueDes);
          break;
        case r'service.save_external_link_references':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servicePeriodSaveExternalLinkReferences.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder();
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

