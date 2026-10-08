//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties.g.dart';

/// OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings] 
@BuiltValue()
abstract class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties implements Built<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties, OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.scripting.sightly.js.bindings')
  ConfigNodePropertyArray? get orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings;

  OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties._();

  factory OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties([void updates(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder b)]) = _$OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties> get serializer => _$OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesSerializer();
}

class _$OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties, _$OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings != null) {
      yield r'org.apache.sling.scripting.sightly.js.bindings';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.scripting.sightly.js.bindings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder();
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

