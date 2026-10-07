//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_properties.g.dart';

/// OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel] 
@BuiltValue()
abstract class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties implements Built<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.scripting.javascript.rhino.optLevel')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel;

  OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties._();

  factory OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties([void updates(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder b)]) = _$OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties> get serializer => _$OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesSerializer();
}

class _$OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties, _$OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel != null) {
      yield r'org.apache.sling.scripting.javascript.rhino.optLevel';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.scripting.javascript.rhino.optLevel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder();
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

